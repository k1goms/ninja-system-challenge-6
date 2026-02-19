package service;

import enums.SortOption;
import exception.NinjaNotFoundException;
import model.Ninja;
import model.NinjaDTO;
import util.SampleData;
import java.util.LinkedList;
import java.util.stream.Collectors;

public final class NinjaService {

    private final LinkedList<Ninja> ninjaList = SampleData.createNinjaLinkedList();

    private void checkName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
    }

    private void checkNinjaState(Ninja ninja) {
        if (ninja == null) {
            throw new IllegalArgumentException("Ninja cannot be empty");
        }
    }

    private void checkNinjaListState() {
        if (ninjaList.isEmpty()) {
            throw new IllegalStateException("Ninja List is empty");
        }
    }

    public void checkIfNinjaNameExists(String name) {
        checkName(name);
        if (ninjaList.stream()
                .anyMatch(n -> n.getName().equalsIgnoreCase(name))) {
            throw new IllegalArgumentException("Ninja already exists");
        }
    }

    public void addNinjaToEnd(NinjaDTO ninjaDTO) {
        checkIfNinjaNameExists(ninjaDTO.name());
        Ninja ninja = new Ninja(ninjaDTO);
        checkNinjaState(ninja);
        ninjaList.addLast(ninja);
    }

    public void addNinjaToStart(NinjaDTO ninjaDTO) {
        checkIfNinjaNameExists(ninjaDTO.name());
        Ninja ninja = new Ninja(ninjaDTO);
        checkNinjaState(ninja);
        ninjaList.addFirst(ninja);
    }

    public NinjaDTO removeFirstNinja() {
        checkNinjaListState();
        Ninja removed = ninjaList.removeFirst();
        return new NinjaDTO(removed);
    }


    public NinjaDTO getNinjaByIndex(int index) {
        checkNinjaListState();
        if (index < 0 || index >= ninjaList.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return new NinjaDTO(ninjaList.get(index));
    }

    public LinkedList<NinjaDTO> getAllNinjas() {
        return ninjaList.stream()
                .map(NinjaDTO::new)
                .collect(Collectors.toCollection(LinkedList::new));
    }


    public void sortListByAttribute(SortOption sortOption) {
        checkNinjaListState();
        ninjaList.sort(sortOption.getComparator());
    }


    public NinjaDTO searchNinjaByName(String name) {

        checkNinjaListState();

        checkName(name);

        return new NinjaDTO(ninjaList.stream()
                .filter(n -> n.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() ->
                        new NinjaNotFoundException("Ninja " + name + " not found")
                ));
    }


}

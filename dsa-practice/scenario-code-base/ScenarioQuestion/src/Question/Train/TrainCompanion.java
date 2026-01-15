package Question.Train;

public class TrainCompanion {
    private Compartment head;
    private Compartment tail;
    
    public void addCompartment(String name) {
        Compartment newCompartment = new Compartment(name);

        if (head == null) {
            head = tail = newCompartment;
            return;
        }

        tail.next = newCompartment;
        newCompartment.prev = tail;
        tail = newCompartment;
    }
    public void removeCompartment(String name) {
        Compartment current = head;

        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {

                if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                }
                else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                System.out.println(name + " compartment removed.");
                return;
            }
            current = current.next;
        }
        System.out.println("Compartment not found.");
    }
    public void moveForward() {
        Compartment temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.name + " → ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public void moveBackward() {
        Compartment temp = tail;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.name + " → ");
            temp = temp.prev;
        }
        System.out.println("Start");
    }
    public void showAdjacent(String name) {
        Compartment current = head;

        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {

                String prev = (current.prev != null)
                        ? current.prev.name : "None";

                String next = (current.next != null)
                        ? current.next.name : "None";

                System.out.println("Current: " + current.name);
                System.out.println("Previous: " + prev);
                System.out.println("Next: " + next);
                return;
            }
            current = current.next;
        }

        System.out.println("Compartment not found.");
    }
}
package Question.Hospital;

class AmbulanceRoute {
    private HospitalUnit head = null;

    public void addUnit(String name, boolean available) {
        HospitalUnit newUnit = new HospitalUnit(name, available);

        if (head == null) {
            head = newUnit;
            newUnit.next = head;
            return;
        }

        HospitalUnit temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newUnit;
        newUnit.next = head;
    }
    
    public HospitalUnit findNearestAvailableUnit() {
        if (head == null) {
            System.out.println("No hospital units available.");
            return null;
        }

        HospitalUnit current = head;

        do {
            if (current.available) {
                System.out.println("Patient redirected to: " + current.name);
                return current;
            }
            current = current.next;
        } while (current != head);

        System.out.println("All units are busy!");
        return null;
    }
    public void removeUnit(String unitName) {
        if (head == null) return;

        HospitalUnit current = head;
        HospitalUnit prev = null;

        do {
            if (current.name.equalsIgnoreCase(unitName)) {

              
                if (current == head && current.next == head) {
                    head = null;
                    return;
                }

             
                if (current == head) {
                    HospitalUnit tail = head;
                    while (tail.next != head) {
                        tail = tail.next;
                    }
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }

                System.out.println(unitName + " removed for maintenance.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }
    public void displayUnits() {
        if (head == null) {
            System.out.println("No units in route.");
            return;
        }

        HospitalUnit temp = head;
        do {
            System.out.print(temp.name + "(" + (temp.available ? "Available" : "Busy") + ") → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to Start)");
    }

}
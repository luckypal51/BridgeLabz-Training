package Question.Traffic;

class Roundabout {
    private Vehicle head = null;

  
    public void addVehicle(Vehicle v) {
        if (head == null) {
            head = v;
            head.next = head;
            return;
        }

        Vehicle temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = v;
        v.next = head;
    }

 
    public void removeVehicle(String vehicleNo) {
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Vehicle curr = head, prev = null;

        do {
            if (curr.vehicleNo.equals(vehicleNo)) {
                if (curr == head) {
                    Vehicle last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                System.out.println(vehicleNo + " exited roundabout");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found");
    }

   
    public void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.vehicleNo + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}

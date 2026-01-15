package Question.Courier;

class ParcelTracker {
    private StageNode head;

   
    public ParcelTracker() {
        head = new StageNode("Packed");
        head.next = new StageNode("Shipped");
        head.next.next = new StageNode("In Transit");
        head.next.next.next = new StageNode("Delivered");
    }

  
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel is lost (no tracking data).");
            return;
        }

        StageNode temp = head;
        System.out.print("Parcel Tracking: ");
        while (temp != null) {
            System.out.print(temp.stageName);
            if (temp.next != null) {
                System.out.print(" → ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

   
    public void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;

        while (temp != null) {
            if (temp.stageName.equalsIgnoreCase(afterStage)) {
                StageNode checkpoint = new StageNode(newStage);
                checkpoint.next = temp.next;
                temp.next = checkpoint;
                System.out.println("Checkpoint added: " + newStage);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Stage not found. Checkpoint not added.");
    }

   
    public void markParcelLost() {
        head = null;
        System.out.println("Parcel marked as LOST.");
    }
}

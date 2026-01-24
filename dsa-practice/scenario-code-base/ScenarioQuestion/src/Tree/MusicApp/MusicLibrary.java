package Tree.MusicApp;

public class MusicLibrary {
    private Song root;

    public void insert(int id, String title, String artist) {
        root = insertRec(root, id, title, artist);
    }

    private Song insertRec(Song root, int id, String title, String artist) {
        if (root == null) {
            return new Song(id, title, artist);
        }

        if (id < root.trackId) {
            root.left = insertRec(root.left, id, title, artist);
        } else if (id > root.trackId) {
            root.right = insertRec(root.right, id, title, artist);
        }

        return root;
    }

    public Song search(int id) {
        return searchRec(root, id);
    }

    private Song searchRec(Song root, int id) {
        if (root == null || root.trackId == id) {
            return root;
        }

        if (id < root.trackId) {
            return searchRec(root.left, id);
        }

        return searchRec(root.right, id);
    }

    public void showPlaylist() {
        System.out.println("Playlist:");
        inorder(root);
    }

    private void inorder(Song root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root);
            inorder(root.right);
        }
    }
}

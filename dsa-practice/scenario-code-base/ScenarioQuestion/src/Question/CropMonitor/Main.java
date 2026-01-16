package Question.CropMonitor;

public class Main {

    public static void main(String[] args) {
        SensorData[] readings = {
            new SensorData(1705483000L, 24.5),
            new SensorData(1705481000L, 22.1),
            new SensorData(1705489000L, 26.0),
            new SensorData(1705485000L, 23.4)
        };
        quickSort(readings, 0, readings.length - 1);

        System.out.println("After Sorting (by Timestamp):");
        for (SensorData s : readings) {
            System.out.println(s.timestamp + " => " + s.temperature);
        }
    }
	static int partition(SensorData[] data, int low, int high) {
        long pivot = data[high].timestamp;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (data[j].timestamp < pivot) {
                i++;
                SensorData temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                }
        }

        SensorData temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }

    static void quickSort(SensorData[] data, int low, int high) {
        if (low < high) {
            int pi = partition(data, low, high);
            quickSort(data, low, pi - 1);
            quickSort(data, pi + 1, high);
        }
    }

}

import java.util.ArrayList;

public class Heaps {
    static class Heap {
        ArrayList<Integer> heap = new ArrayList<>();

        public void add(int data) {
            heap.add(data);

            int x = heap.size() - 1;//child idx
            int parent_idx = (x - 1) / 2;//parent idx

            while (heap.get(parent_idx) > heap.get(x)) {//
                int temp = heap.get(x);
                heap.set(x, heap.get(parent_idx));
                heap.set(parent_idx, temp);
                x = parent_idx;
                parent_idx = (x - 1) / 2;
            }

        }

        public int peek() {
            return heap.get(0);
        }

        public int remove() {
            int data = heap.get(0);
//            Step-1 : swap first and last
            int temp = heap.get(0);
            heap.set(0, heap.get(heap.size() - 1));
            heap.set(heap.size() - 1, temp);
//            Step-2 : delete last
            heap.remove(heap.size() - 1);

//            Step-3 : Heapify
            heapify(0);
            return data;
        }

        private void heapify(int idx) {
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            int minIdx = idx;
            if (left < heap.size() && heap.get(minIdx) > heap.get(left))//
                minIdx = left;
            if (right < heap.size() && heap.get(minIdx) > heap.get(right))//
                minIdx = right;
            if (minIdx != idx) {
//                swap;
                int temp = heap.get(idx);
                heap.set(idx, heap.get(minIdx));
                heap.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public boolean Empty() {
            return heap.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(3);
        heap.add(1);
        heap.add(4);
        heap.add(7);
        while (!heap.Empty()) {
            System.out.println(heap.peek());
            heap.remove();
        }
    }
}

import java.util.*;

public class Graph {
    /*Khởi tạo Hashmap để lưu các cặp
      Key và Value của đồ thị */
    private final Map<String, List<String>> adjList;
    private final Map<String, String> parent;

    //Tạo constructor
    public Graph(){
        this.adjList = new HashMap<>();
        this.parent = new HashMap<>();
    }

    //Tạo phương thức thêm các đỉnh của đồ thị
    public void addVertex(String vertex){
        /* (K,V) Key sẽ lưu các đỉnh của đồ thị
          Value sẽ lưu các danh sách các đỉnh kề với Key*/
        adjList.put(vertex, new ArrayList<>());
    }

    //Tạo phuong thức lưu các cặp cạnh của đồ thị
    public void addEdge(String source, String destination){
        /* Nếu đỉnh source hoặc đỉnh destination ko có trong đồ thị
           Thì quăng ra màn hình 1 thông báo lỗi*/
        if (!adjList.containsKey(source)){
            throw new IllegalArgumentException("Không có " + source + " trong đồ thị");
        } else if (!adjList.containsKey(destination)) {
            throw new IllegalArgumentException("Không có " + destination + " trong đồ thị");
        }

        /*Nếu các đỉnh có các quận thì sẽ tiến hành
          thêm các cạnh giữa các đỉnh vào danh sách cạnh*/
        adjList.get(source).add(destination);
        /*Nếu Quận có đường đi 2 chiều
         Thì thực hiện dòng lệnh bên dưới
         Nghĩa là đồ thị vô hướng á ae */
        adjList.get(destination).add(source);
    }

    public boolean DLS(String start, String target, int limit){
        Stack<String> stack = new Stack<>();
        Set<String> visited = new HashSet<>();

        stack.push(start);
        parent.put(start, null);

        while (!stack.isEmpty()){
            String current = stack.pop();
            visited.add(current);

            if (current.equals(target)){
                return true;
            }else if (visited.size() <= limit){
                for (String neighbor : adjList.get(current)) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                        parent.put(neighbor, current);
                    }
                }
            }
        }

        return false;
    }

    public List<String> getPath(String start, String target){
        List<String> path = new ArrayList<>();
        String current = target;

        while (current!=null){
            path.add(current);
            current = parent.get(current);
        }
        Collections.reverse(path);
        return path;
    }

    //Khởi tạo phương thức xuất đồ thị ra màn hình
    public void display(){
        //Phương thức keySet dùng đê trả về các giá trị của các Key trong HashMap
        //Sử dụng foreach để duyệt từng Key có trong HashMap
        for (String district : adjList.keySet()) {
        //Sau đó xuất các Key ra màn hình
            System.out.print(district + ": ");
        //Biến neighbor dùng để duyệt qua từng phần tử trong danh sách cạnh của đổ thị
            for (String neighbor : adjList.get(district)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    //Để hiểu rõ về display() , ae có thể đặt breakpoint rồi debug nha
}

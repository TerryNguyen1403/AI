import java.util.List;

public class Main {
    // File Main dùng để chạy thử chương trình nha ae
    public static void main(String[] args) {
        Graph HCM_graph = new Graph();

        HCM_graph.addVertex("Quận 1");
        HCM_graph.addVertex("Quận 2");
        HCM_graph.addVertex("Quận 3");
        HCM_graph.addVertex("Quận 4");

        HCM_graph.addEdge("Quận 1", "Quận 2");
        HCM_graph.addEdge("Quận 1", "Quận 3");
        HCM_graph.addEdge("Quận 2", "Quận 4");

        String start = "Quận 1";
        String target = "Quận 4";
        int limited = 4;

        if (HCM_graph.DLS(start, target, limited)) {
            System.out.println("Đường đi tồn tại");
            List<String> path = HCM_graph.getPath(start,target);
            System.out.println("Đường đi: " + String.join(" -> ", path));
        } else {
            System.out.println("Không có đường đi");
        }

        //HCM_graph.display();
    }
}

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

        HCM_graph.display();
    }
}

import java.util.List;

public class Main {
    // File Main dùng để chạy thử chương trình nha ae
    public static void main(String[] args) {
        Graph HCM_graph = new Graph();

        HCM_graph.addVertex("Hóc Môn");
        HCM_graph.addVertex("Bình Chánh");
        HCM_graph.addVertex("Nhà Bè");
        HCM_graph.addVertex("Quận 1");
        HCM_graph.addVertex("Quận 3");
        HCM_graph.addVertex("Quận 4");
        HCM_graph.addVertex("Quận 5");
        HCM_graph.addVertex("Quận 6");
        HCM_graph.addVertex("Quận 7");
        HCM_graph.addVertex("Quận 8");
        HCM_graph.addVertex("Quận 10");
        HCM_graph.addVertex("Quận 11");
        HCM_graph.addVertex("Quận 12");
        HCM_graph.addVertex("Quận Bình Tân");
        HCM_graph.addVertex("Quận Tân Phú");
        HCM_graph.addVertex("Quận Tân Bình");
        HCM_graph.addVertex("Quận Gò Vấp");
        HCM_graph.addVertex("Quận Bình Thạnh");
        HCM_graph.addVertex("Quận Phú Nhuận");

        //Các quận kề với Hóc Môn
        HCM_graph.addEdge("Hóc Môn", "Quận 12");
        HCM_graph.addEdge("Hóc Môn", "Quận Bình Tân");
        HCM_graph.addEdge("Hóc Môn", "Bình Chánh");

        //Các quận kề với Bình Chánh
        HCM_graph.addEdge("Bình Chánh", "Hóc Môn");
        HCM_graph.addEdge("Bình Chánh", "Quận Bình Tân");
        HCM_graph.addEdge("Bình Chánh", "Quận 8");
        HCM_graph.addEdge("Bình Chánh", "Quận 7");
        HCM_graph.addEdge("Bình Chánh", "Nhà Bè");

        //Các quận kề với Nhà Bè
        HCM_graph.addEdge("Nhà Bè", "Bình Chánh");
        HCM_graph.addEdge("Nhà Bè", "Quận 7");

        //Các quận kề với Quận 1
        HCM_graph.addEdge("Quận 1", "Quận Bình Thạnh");
        HCM_graph.addEdge("Quận 1", "Quận Phú Nhuận");
        HCM_graph.addEdge("Quận 1", "Quận 3");
        HCM_graph.addEdge("Quận 1", "Quận 5");
        HCM_graph.addEdge("Quận 1", "Quận 4");

        //Các quận kề với Quận 3
        HCM_graph.addEdge("Quận 3", "Quận 1");
        HCM_graph.addEdge("Quận 3", "Quận Phú Nhuận");
        HCM_graph.addEdge("Quận 3", "Quận 10");

        //Các quận kề với Quận 4
        HCM_graph.addEdge("Quận 4", "Quận 1");
        HCM_graph.addEdge("Quận 4", "Quận 5");
        HCM_graph.addEdge("Quận 4", "Quận 8");
        HCM_graph.addEdge("Quận 4", "Quận 7");

        //Các quận kề với Quận 5
        HCM_graph.addEdge("Quận 5", "Quận 4");
        HCM_graph.addEdge("Quận 5", "Quận 1");
        HCM_graph.addEdge("Quận 5", "Quận 10");
        HCM_graph.addEdge("Quận 5", "Quận 11");
        HCM_graph.addEdge("Quận 5", "Quận 6");
        HCM_graph.addEdge("Quận 5", "Quận 8");

        //Các quận kề với Quận 6
        HCM_graph.addEdge("Quận 6", "Quận 5");
        HCM_graph.addEdge("Quận 6", "Quận 11");
        HCM_graph.addEdge("Quận 6", "Quận Tân Phú");
        HCM_graph.addEdge("Quận 6", "Quận Bình Tân");
        HCM_graph.addEdge("Quận 6", "Quận 8");

        //Các quận kề với Quận 7
        HCM_graph.addEdge("Quận 7", "Quận 4");
        HCM_graph.addEdge("Quận 7", "Quận 8");
        HCM_graph.addEdge("Quận 7", "Bình Chánh");
        HCM_graph.addEdge("Quận 7", "Nhà Bè");

        //Các quận kề với Quận 8
        HCM_graph.addEdge("Quận 8", "Quận 7");
        HCM_graph.addEdge("Quận 8", "Quận 4");
        HCM_graph.addEdge("Quận 8", "Quận 5");
        HCM_graph.addEdge("Quận 8", "Quận 6");
        HCM_graph.addEdge("Quận 8", "Quận Bình Tân");
        HCM_graph.addEdge("Quận 8", "Bình Chánh");

        //Các quận kề với Quận 10
        HCM_graph.addEdge("Quận 10", "Quận 1");
        HCM_graph.addEdge("Quận 10", "Quận 3");
        HCM_graph.addEdge("Quận 10", "Quận Tân Bình");
        HCM_graph.addEdge("Quận 10", "Quận 11");
        HCM_graph.addEdge("Quận 10", "Quận 5");

        //Các quận kề với Quận 11
        HCM_graph.addEdge("Quận 11", "Quận 5");
        HCM_graph.addEdge("Quận 11", "Quận 10");
        HCM_graph.addEdge("Quận 11", "Quận Tân Bình");
        HCM_graph.addEdge("Quận 11", "Quận Tân Phú");
        HCM_graph.addEdge("Quận 11", "Quận 6");

        //Các quận kề với Quận 12
        HCM_graph.addEdge("Quận 12", "Hóc Môn");
        HCM_graph.addEdge("Quận 12", "Quận Bình Tân");
        HCM_graph.addEdge("Quận 12", "Quận Tân Phú");
        HCM_graph.addEdge("Quận 12", "Quận Tân Bình");
        HCM_graph.addEdge("Quận 12", "Quận Gò Vấp");

        //Các quận kề với Quận Bình Tân
        HCM_graph.addEdge("Quận Bình Tân", "Hóc Môn");
        HCM_graph.addEdge("Quận Bình Tân", "Quận 12");
        HCM_graph.addEdge("Quận Bình Tân", "Quận Tân Phú");
        HCM_graph.addEdge("Quận Bình Tân", "Quận 6");
        HCM_graph.addEdge("Quận Bình Tân", "Quận 8");
        HCM_graph.addEdge("Quận Bình Tân", "Bình Chánh");

        //Các quận kề với Quận Tân Phú
        HCM_graph.addEdge("Quận Tân Phú", "Quận 6");
        HCM_graph.addEdge("Quận Tân Phú", "Quận 11");
        HCM_graph.addEdge("Quận Tân Phú", "Quận Tân Bình");
        HCM_graph.addEdge("Quận Tân Phú", "Quận 12");
        HCM_graph.addEdge("Quận Tân Phú", "Quận Bình Tân");

        //Các quận kề với Quận Tân Bình
        HCM_graph.addEdge("Quận Tân Bình", "Quận 11");
        HCM_graph.addEdge("Quận Tân Bình", "Quận 10");
        HCM_graph.addEdge("Quận Tân Bình", "Quận 3");
        HCM_graph.addEdge("Quận Tân Bình", "Quận Phú Nhuận");
        HCM_graph.addEdge("Quận Tân Bình", "Quận Gò Vấp");
        HCM_graph.addEdge("Quận Tân Bình", "Quận 12");
        HCM_graph.addEdge("Quận Tân Bình", "Quận Tân Phú");

        //Các quận kề với Quận Gò Vấp
        HCM_graph.addEdge("Quận Gò Vấp", "Quận Tân Bình");
        HCM_graph.addEdge("Quận Gò Vấp", "Quận Phú Nhuận");
        HCM_graph.addEdge("Quận Gò Vấp", "Quận Bình Thạnh");
        HCM_graph.addEdge("Quận Gò Vấp", "Quận 12");

        //Các quận kề với Quận Bình Thạnh
        HCM_graph.addEdge("Quận Bình Thạnh", "Quận 12");
        HCM_graph.addEdge("Quận Bình Thạnh", "Quận Gò Vấp");
        HCM_graph.addEdge("Quận Bình Thạnh", "Quận Phú Nhuận");
        HCM_graph.addEdge("Quận Bình Thạnh", "Quận 1");

        //Các quận kề với Quận Phú Nhuận
        HCM_graph.addEdge("Quận Phú Nhuận", "Quận 3");
        HCM_graph.addEdge("Quận Phú Nhuận", "Quận 1");
        HCM_graph.addEdge("Quận Phú Nhuận", "Quận Bình Thạnh");
        HCM_graph.addEdge("Quận Phú Nhuận", "Quận Gò Vấp");
        HCM_graph.addEdge("Quận Phú Nhuận", "Quận Tân Bình");

        String start = "Quận Tân Phú";
        String target = "Quận Phú Nhuận";
        int limited = 2;

        if (!HCM_graph.isValid(start, target)){
            throw new IllegalArgumentException("Có Quận không nằm trong Hồ Chí Minh!");
        }

        if (HCM_graph.DLS(start, target, limited)) {
            System.out.println("Đường đi tồn tại");
            List<String> path = HCM_graph.getPath(start,target);
            System.out.println("Đường đi: " + String.join(" -> ", path));
        } else {
            System.out.println("Không có đường đi");
        }
        
    }
}

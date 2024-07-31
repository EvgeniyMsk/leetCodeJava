package ou.task559;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        Node root = new Node(1);
        root.children = new ArrayList<>();
        Node child = new Node(3);
        child.children = new ArrayList<>() {
            {
                add(new Node(5));
                add(new Node(6));
            }
        };
        root.children.add(child);
        root.children.add(new Node(2));
        root.children.add(new Node(4));

        assertEquals(3, solution.maxDepth(root));
    }

    @Test
    public void test_2() {
        Node node2 =  new Node(2);
        Node node6 = new Node(6);
        Node node14 = new Node(14);
        Node node11 = new Node(11, new ArrayList<>() {{ add(node14); }});
        Node node7 = new Node(7, new ArrayList<>() {{ add(node11); }});
        Node node3 = new Node(3, new ArrayList<>() {{ add(node6); add(node7); }});
        Node node12 = new Node(12);
        Node node8 = new Node(8, new ArrayList<>() {{ add(node12); }});
        Node node4 = new Node(8, new ArrayList<>() {{ add(node8); }});
        Node node13 = new Node(13);
        Node node9 = new Node(9, new ArrayList<>() {{ add(node13); }});
        Node node10 = new Node(10);
        Node node5 = new Node(5, new ArrayList<>() {{ add(node9); add(node10); }});

        Node root = new Node(1, new ArrayList<>() {{ add(node2); add(node3); add(node4); add(node5);}});


        assertEquals(5, solution.maxDepth(root));
    }
}

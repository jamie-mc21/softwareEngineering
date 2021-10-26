import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;



@RunWith(JUnit4.class)
public class LCATest {



	@Test
	public void testLCA() {
		LCA tree = new LCA;
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		assertEquals("LCA of 2 and 3: ", 1, tree.findLCA(2, 3).data);
		assertEquals("LCA of 4 and 5: ", 2, tree.findLCA(4, 5).data);
		assertEquals("LCA of 6 and 7: ", 3, tree.findLCA(6, 7).data);
	}

	@Test
	public void testFalseNodes(){
		LCA tree = new LCA();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		assertEquals("False nodes: ", null, tree.findLCA(4, 5));
	}

	@Test
	public void testDirectedAcyclicGraph()
	{
		DirectedAcyclicGraph DirectedAcyclicGraph = new DirectedAcyclicGraph(10);
		DirectedAcyclicGraph.addEdge(1, 3);
		DirectedAcyclicGraph.addEdge(4, 5);
		DirectedAcyclicGraph.addEdge(4, 6);
		DirectedAcyclicGraph.addEdge(5, 6);
		DirectedAcyclicGraph.addEdge(5, 7);

	}


@Test
public void addEdge()
{
	DirectedAcyclicGraph DirectedAcyclicGraph = new DirectedAcyclicGraph(10);
	DirectedAcyclicGraph.addEdge(1,3);
}

@Test(expected=Exception.class)
public void testFalse()
{
			DirectedAcyclicGraph DirectedAcyclicGraph = new DirectedAcyclicGraph(-10);
}

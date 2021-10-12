import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class unitTestJava {

	@Test
	public void emptyTest() {
    lca <Integer, Integer> LCA = new lca<Integer, Integer>();
    assertEquals("checking if equal");
    assertFalse("checking if false");
    assertEmpty("checking if null");
    assertTrue("checking if true")
  }

@Test
  public void existsTest() {
		lca<Integer, Integer> LCA = new lca<Integer, Integer>();
		assertFalse("Checking if any node exists in empty tree");
  }

  @Test
public void createHeadTest(){
  LowestCommonAncestor newHead = new LowestCommonAncestor();
  lca.createHead(1,6);
  assertEquals("Create a head", '1');
}

  @Test
  public void addNodeTest(){
    lca <Integer, Integer> newNode = new lca<Integer, Integer>();
		lca.addNode(1,1);
    assertTrue("Checking if tree contains key ", lca.exists(1));
    lca.addNode(null,  null);
    assertFalse("Checking if tree contains a null key ", lca.exists(null));
  }


  @Test
  public void findNodeTest(){
    lca <Integer, Integer> findNode = new lca<Integer, Integer>();
    lca.addNode(1, 1);
    lca.addNode(2, 2);
    lca.addNode(3, 3);
    lca.addNode(4, 4);
    lca.addNode(5, 5);
  }

  @Test
  public void lcaTest(){
    lca<Integer, Integer> LCA = new lca<Integer, Integer>();
		lca.addNode(1, 1);
		lca.addNode(5, 5);
		lca.addNode(3, 3);
		lca.addNode(4, 4);
		lca.addNode(8, 8);
		lca.addNode(6, 6);
  }

  @Test
  public void printTest(){
    lca<Integer, Integer> LCA = new lca<Integer, Integer>();
    lca.addNode(1, 4);
    lca.addNode(2, 2);
    lca.addNode(3, 4);
    lca.addNode(9, 2);
    lca.addNode(1, 4);
  }

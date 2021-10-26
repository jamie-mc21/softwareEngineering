import unittest
import LCA

class LCATest(unittest.TestCase):

    def testLCA(self):

        self.root = LCA.Node(4)
        self.root.left = LCA.Node(3)
        self.root.right = LCA.Node(7)
        self.root.left.left = LCA.Node(1)
        self.root.left.right = LCA.Node(5)
        self.root.right.left = LCA.Node(6)
        self.root.right.right = LCA.Node(8)

        def test_findPath(self):

            self.assertEqual(lca.LCA(self.root, 3, 5),3 , "LCA(3,5 ) should be 3")
            self.assertEqual(lca.LCA(self.root, 7,6 ),7 , "LCA(7,6 ) should be 7")
            self.assertEqual(lca.LCA(self.root, 4,1 ), 4, "LCA(4,1 ) should be 4")
            self.assertEqual(lca.LCA(self.root, 9,7 ), None, "LCA(9,7 ) should be None")

            if __name__ == '__main__':
                unittest.main()

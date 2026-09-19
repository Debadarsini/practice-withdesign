import java.util.*;
public class LCAOfTrees {

// Definiton of a binary tree node class
class EduTreeNode {
     int data;
     EduTreeNode left;
     EduTreeNode right;
     EduTreeNode parent;

     EduTreeNode(int value) {
       this.data = value;
         this.left = null;
         this.right = null;
        this.parent = null;
    }
 }

    public EduTreeNode LowestCommonAncestor(EduTreeNode p, EduTreeNode q) {

        // Replace this placeholder with actual logic
        int depthP=getDepth(p);
        int depthQ=getDepth(q);

        while(depthP>depthQ){
            p=p.parent;
            depthP--;
        }

        while(depthQ>depthP){
            q=q.parent;
            depthQ--;
        }
        while(p!=q){
            p=p.parent;
            q=q.parent;
        }

        return q;
    }

    private int getDepth(EduTreeNode node){
        int depth=0;
        while(node.parent!=null){
            node=node.parent;
            depth++;
        }
        return depth;
    }

    public static void main (String []  args){
       // [2079,-5682,-8422,-4654,-7700,-6909,-2433,-6027,5244,4410,3667,-9304,-1847,5753,-9040,6968,4246,1812,3266,-8918,5225,-5353,6165,-1751,1681,-7240,-7681,8694,-8483,-4086,-4556,2709,6415,-6158,-3032,9663,-5635,-6987,3383,-910,-4249,9814,7194,-6530,2519,8373,-9590,9435,-7311,6989,8173,6379,-8641,5075,3533,-8867,2909,-4951,2934,-7625,8682,-7486,-9662,2302,5799,-4957,2661,-7124,-9039,706,-8425,-1818,-8248,-3571,8667,-331,-5037,-7450,1596,3760,8358,2150,3567,6645,3005,6710,-3684,-4028,6612,-7671,4165,-1408,-8932,-1652,-2772,888,4206,3231,1852,-9644,-8282,6262,-739,396,-8889,7150,9889,4430,420,101,-6332,null,-8348,987,2705,-7035,-2570,-8878,5579,-2187,null,-5368,5020,-1860,null,-4276,8958,-3516,null,8151,7372,-1788,null,-8736,-2093,-9114,3263,null,6983,null,null,-9019,-1943,null,null,null,null,930,1338,-2523,null,-1710,-1053,6568,-1708,null,-2086,9557,null,3625,-7885,-8948,-2541,773,null,null,7494,9615,-6806,2011,null,-4461,3473,8740,-7207,null,1565,-467,-8582,null,null,-9110,8183,6775,1661,null,-571,8395,8034,2343,null,7376,-8594,null,4483,8605,-4888,-8078,-5549,null,null,-7770,-2206,4320,2171,1441,9346,null,7543,3337,null,-7707,-3147,8842,-9414,450,4665,-4696,-8262,-6497,-8666,null,null,837,-6131,4752,-3691,1340,-5544,null,-5439,5492,2928,-5057,-7543,null,778,-3412,-260,1467,-8578,7340,-70,null,null,4089,-2023,null,-6786,null,null,null,8982,null,9211,-761,-39,5807,null,null,null,null,null,9750,-7922,9021,null,-900,null,-4251,null,null,-9849,9071,null,null,-7394,null,-8773,-2643,null,null,-1503,8576,null,6886,null,null,null,null,9964,-5421,5716,null,7409,null,null,7181,-643,7156,null,null,-7511,5024,-2376,null,null,null,null,3907,-6752,-2689,-8274,null,null,null,-1328,null,null,null,-2237,null,-1522,null,null,null,-8482,null,null,-267,null,null,null,null,null,null,null,null,null,2439,null,null,null,null,8091,null,null,null,3147,-5917,9888,null,null,-2260,null,null,-24,8882,9242,7618,null,null,null,-7630,-5898,-2962,null,7309,-9542,null,5397,null,null,null,4030,null,null,6874,6175,274,null,null,null,null,null,null,7551,3805,null,null,null,-3406,-4554,null,1978,null,-8130,null,2425,null,null,5147,null,null,8781,null,-200,-1941,null,null,null,null,null,-3186,null,-6608,8236,null,null,null,null,null,4321,null,8746,-713,3648,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,-2519,null,null,-4269,null,null,null,null,null,null,null,null,null,null,null,null,null,-1419,null,null,null,null,null,null,null,null,null,null,null,null,null,-1318,null,null,null,null,null,null,null,null,null,null,null,null,5347,9924,null,null,null,null,null,-6,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,-3507,880,7957,null,null,null,null,null,null,null,-7314,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,-4185,null,null,null,null,null,null,null,null,null,-2250,3798,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,-244]
    }

}

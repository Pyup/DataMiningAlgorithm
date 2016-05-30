package DataMining_Apriori;

/**
 * apriori关联规则挖掘算法调用类
 * @author lyq
 *
 */
public class Client {
	public static void main(String[] args){
		String filePath = "/home/wongkongtao/GitRepository/DataMining/AssociationAnalysis/DataMining_Apriori/testInput.txt";
		
		AprioriTool tool = new AprioriTool(filePath, 2);
		tool.printAttachRule(0.7);
	}
}
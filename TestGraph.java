import java.util.LinkedList;
class GraphByMatrix
{
	boolean adjmtx [][];
	int NoOfVertices;
	GraphByMatrix(int N)
	{
		NoOfVertices = N;
		adjmtx = new boolean[NoOfVertices][NoOfVertices];
	}
	public void addEdges(int i,int j)
	{
		if(i>=0 && i<NoOfVertices && j>=0 && j<NoOfVertices)
		{
			adjmtx[i][j]=true;
			adjmtx[j][i]=true; //for undirected graph only
		}
	}
	public void removeEdges(int i,int j)
	{
		if(i>=0 && i<NoOfVertices && j>=0 && j<NoOfVertices)
		{
			if(adjmtx[i][j]==false)
				System.out.println("No Edges found");
			else
				adjmtx[i][j]=false;
		}
	}
	public void checkEdges(int i,int j)
	{
		if(i>=0 && i<NoOfVertices && j>=0 && j<NoOfVertices)
		{
			if(adjmtx[i][j]==true)
				System.out.println("Yes.");
			else
				System.out.println("No.");	
		}
	}
	public void removeAllCycles()
	{
		for(int i=0;i<NoOfVertices;i++)
		{
			if(adjmtx[i][i]==true)
				adjmtx[i][i]=false;
		}
	}
	public void PrintMatrixList()
	{
		for(int i=0;i<NoOfVertices;i++) 
		{
			System.out.print("head-"+i);
			for(int j=0;j<NoOfVertices;j++)
			{
				if(adjmtx[i][j]==true)
					System.out.print("-->"+j);	
			}
			System.out.println();
		}
	}
}

class GraphByList{
	int vertexCount;
	LinkedList <Integer>AdjLinkedList[];
	GraphByList(int v)
	{
		vertexCount = v;
		AdjLinkedList = new  LinkedList[vertexCount];
		for(int i=0;i<vertexCount;i++)
		{
			AdjLinkedList[i] = new LinkedList<>();
		}
	}
	public void addEdgesToList(int sou,int des)
	{
		AdjLinkedList[sou].add(des);
		AdjLinkedList[des].add(sou); // undirected grapth
	}
	public void printList()
	{
		for(int i=0;i<vertexCount;i++)
		{
			System.out.print("head-"+i);
			for(Integer p: AdjLinkedList[i])
			{
				System.out.print("-->"+p);
			}
			System.out.println();
		}
	}
}
class TestGraph
{
	public static void main(String[] args) 
	{
		System.out.println("GRAPH BY MATRIX");
		GraphByMatrix gbm = new GraphByMatrix(5);
		gbm.addEdges(1,2);
		gbm.addEdges(3,4);
		gbm.addEdges(0,0);
		gbm.addEdges(2,2);
		gbm.addEdges(1,4);
		gbm.checkEdges(1,0);
		gbm.checkEdges(3,4);
		gbm.removeEdges(3,4);
		gbm.checkEdges(3,4);
		gbm.PrintMatrixList();
		gbm.removeAllCycles();
		gbm.PrintMatrixList();
		System.out.println("GRAPH BY LIST");
		GraphByList gbl = new GraphByList(5);
		gbl.addEdgesToList(1,3);
		gbl.addEdgesToList(1,2);
		gbl.addEdgesToList(0,2);		
		gbl.printList();

	}
}
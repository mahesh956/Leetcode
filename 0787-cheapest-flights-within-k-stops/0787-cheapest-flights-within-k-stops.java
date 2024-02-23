class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Tuple{
    int first;
    int second;
    int third;
    public Tuple(int first,int second,int third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int m=flights.length;
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            adj.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
        }
        Queue<Tuple> q=new LinkedList<>();
        q.add(new Tuple(0,src,0));
        int[] dis=new int[n];
        for(int i=0;i<n;i++){
            dis[i]=(int)(1e9);
        }
        dis[src]=0;
        while(!q.isEmpty()){
            Tuple it=q.peek();
            q.remove();
            int stops=it.first;
            int node=it.second;
            int cost=it.third;
            if(stops>k) continue;

            for(Pair iter:adj.get(node)){
                int adjNode=iter.first;
                int edw=iter.second;

                if(cost+edw<dis[adjNode] && stops<=k){
                    dis[adjNode]=cost+edw;
                    q.add(new Tuple(stops+1,adjNode,cost+edw));
                }
            }

        }
        if(dis[dst]==(int)(1e9)) return -1;
        return dis[dst];
    }
}
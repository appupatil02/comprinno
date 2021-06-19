package com.assessment.comprinno;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
import java.security.KeyStore.Entry;
import java.text.DecimalFormat;
	public class Main
		{  
		public static class pgm3{
			int left;
			int right;
			public pgm3(int left, int right)
			{
				this.left = left;
				this.right = right;
			}
		}
		static class Pair
		{
		    int first, second;
		 
		    public Pair(int first, int second)
		    {
		        this.first = first;
		        this.second = second;
		    }
		 
		    public Pair()
		    {}
		}
		 
		static final int N = 100005;
		static final int MAXI = 99999999;
		
		static class Chef implements Comparable<Chef> {
	        int age;
	        int rating;
	        Chef(int age,int rating) {
	            this.age = age;
	            this.rating = rating;
	        }
	        @Override
	        public int compareTo(Chef p) {
	            return this.age-p.age;
	        }
	    }
		/*
		class Pair
		{
		  int f,s;
		  Pair( int f, int s)
		  {
		    this.f=f;
		    this.s=s;
		  }
		}*/
		static class Dish{

		    int id;
		    int time;

		    Dish(int a, int b){
		        this.id = a;
		        this.time = b;
		    }
		}

		static class compare implements Comparator<Dish>{
		    public int compare(Dish a, Dish b){
		        if(a.time!=b.time)return a.time - b.time;
		        else return a.id - b.id;
		    }
		}
		
	/*	 
		
		/*static class pair implements Comparable<pair>
		 
		
		
		*/
	/*	
		
		//static Node tree[];
		//static int a[];
	//	static long mod = 998244353;
		 
	//	 static boolean primes[]=new boolean[10000001];*/
		 
		static double pi = 3.1415926535; 
		 private static final int MAXN = 5000;
		    private static final int MOD = 1000_000_007;
		    private static Modular modular_nCr = new Modular(MOD);
		    private static Modular modular = new Modular(MOD);
		    private static final long[][] nCr = new long[MAXN+5][MAXN+5];
		    static int[] maxval = new int[1000000];
		    static int[] minval = new int[1000000];
		    private static long bruteAns = 1;
		    static double eps = 1e-7;
		    /*
		    static {
		    	nCr[0][0]=1;
				for(int i=0;i<=MAXN;i++)
					nCr[i][0]=1;
				for(int i=1;i<=MAXN;i++){
					for(int j=1;j<=i;j++){
						nCr[i][j]=(nCr[i-1][j-1]+nCr[i-1][j])%MOD;
					}
				}
			}*/
               
		    static { nCr[0][0] = 1;
		    for (int i = 1; i < MAXN; i++) {
		        nCr[i][0] = 1;
		        for (int j = 1; j <= i; j++) {
		            nCr[i][j] = modular_nCr.add(nCr[i - 1][j - 1], nCr[i - 1][j]);
		        } }
			}
			
/*		    static int arr[] , dp[][]
		    static ArrayList<Long> leaf=new ArrayList<>();*/
	        static int mod=1000000007;
		    static int MX = 1000001;
			static int pr[] = new int[MX];
			static boolean cmp[] = new boolean[MX];
			static int c = 0;
			static void pre(){
				for(int x = 2;x<MX;x++){
					if(!cmp[x]){
						pr[c++] = x;
						for(int y = x+x; y<MX; y+=x){
							cmp[y] = true;
						}
					}
				}
			}
		   
	//		static final int MAXN = (int) 1e6;
		    static int spf[] = new int[MAXN];
		    static ArrayList<Integer> primes = new ArrayList<>();
		static   final int size = 1000001;
	//    static	final long MOD = 1000000007L;
	//	static	int n;
		static	int m;
		static	int a[] = new int[size];
	//	static	int dp[] = new int[size];
	//	static	int arr[] = new int[size];
		static	int stops;
		static int[] arr = new int[] {2,3,5,7,11,13,17,19,23,29};
		public static List<Integer> g[];
		public static long[] subLeaf;
		public static long[] count;
		
		public static void dfs(int node,int parent){
		    if(g[node].size()==1){
		        subLeaf[node]=1;
		        return;
		    }
		    long paths=0;
		    for(Integer i : g[node]){
		        if(i==parent){
		            continue;
		        }
		        dfs(i,node);
		        subLeaf[node]+=subLeaf[i];
		        count[node]+=(paths*subLeaf[i]);
		        paths+=subLeaf[i];
		    }
		}
		
	     	static int max_size = 100000;
	     	static int n;
	     	static int[] tree = new int[2*max_size];
			public static void main (String[] args) throws java.lang.Exception
			{  
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		//	FastReader in = new FastReader(System.in);
			StringBuilder sb = new StringBuilder();
	        FastScanner in=new FastScanner();
			Scanner sc = new Scanner(System.in);
			PrintWriter out=new PrintWriter(System.out);
			
			HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
			TreeMap<Integer, Integer> h1 = new TreeMap<Integer, Integer>();
		//	HashMap<Integer, Integer> h2 = new HashMap<Integer, Integer>();
		//	HashSet<Point> s = new HashSet<Point>();
			
		//	HashSet<Double> s2 = new HashSet<Double>();
		//	HashSet<Double> s3 = new HashSet<Double>();
			//	HashSet<Character> h2 = new HashSet<Character>();
			//long t= in.nextLong();
			//	long t = in.nextLong();
			//DecimalFormat df = new DecimalFormat("#,###,##0.000000");
			
		 boolean prime[]=new boolean[10000001];
			   int p[]=new int[10000001];
			    int k=1;
			    Arrays.fill(prime, true);
			    prime[0]=false;
			    prime[1]=false;
			    for(int i=2;i<10000001;i++)
			    {
			        if(!prime[i])
			        {
			        	p[i]=p[i-1];
			            continue;
			        }
			        p[i]=k; k++;
	        for(long j=(long)i*i;j<10000001;j+=i)
            prime[(int)j]=false;
			    }
		//	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		     /*  int pri[]=new int[1000005];
		        int p=2;
		        List<Integer> list=new ArrayList<>();
		        while(p*p <=1000005)
		        {
		            if(pri[p]==0)
		            {
		                for(int i=p*2;i<=1000004;i=i+p)
		                {
		                    pri[i]=1;
		                }
		                list.add(p);
		            }
		            p++;
		        }
		        //System.out.println(list);*/
		
			
			long t = in.nextLong();
			while(t-->0)		
			{
				int n = in.nextInt();
				int[] a = new int[n];
				int flag = 0;
				for(int i=0;i<n;i++)
				{
					a[i] = in.nextInt();
				}
				if(n%2==0)
					flag=1;
				else
				{
					for(int i=0;i<n/2+1;i++)
					{
						if(a[i]!=i+1)
						{
							flag=1;
							break;
						}
					}
					int j=1;
					for(int i=n-1;i>n/2;i--)
					{
						if(a[i]!=j)
						{
							flag=1;
							break;
						}
						j++;
					}
				}
				if(flag==1)
					out.println("no");
				else
					out.println("yes");
			}
			out.close();
			}
		  
			
			
			static long factors(long a, long b)
			{
				int count = 0;
				for(int i = 2 ; i  < b ; ++i){
				if(a % i == 0) {
				count += 1;
				}
				}
				return count;
			}
	
			
			
			static long power(long x, long y) {
		        long mod = 1000000000 + 7;
		        long res = 1;
		        while (y > 0) {
		            if(y%2==1)
		                res=(res*x)%mod;
		            x=(x*x)%mod;
		            y=y/2;
		        }
		        return res;
		    }
			
			static boolean isSquare(int n)
		    {
		        if(Math.ceil((double)Math.sqrt(n))==Math.floor((double)Math.sqrt(n)))
		            return true;
		        return false;
		    }
		
			public static long gcd(long a,long b,long n){
			    if(a==b){
			        return (power(a,n,mod)+power(b,n,mod))%mod;
			    }
			    long res=1l;
			    long num=a-b;
			    for(long i=1;i*i<=num;i++){
			        if(num%i==0){
			            long temp= (power(a,n,i)+ power(b,n,i))%i;
			            if(temp==0){
			                res=Math.max(res,i);
			            }
			            temp= (power(a,n,num/i) + power(b,n,num/i))%(num/i);
			             if(temp==0){
			                res=Math.max(res,num/i);
			            }
			        }
			    }
			    return res%mod;
			}
			public static long power(long a,long n,long d){
			    long res=1l;
			    while(n>0){
			        if(n%2==1){
			            res =((res%d)*(a%d))%d;
			            n--;
			        }else{
			            a=((a%d)*(a%d))%d;
			            n=n/2;
			        }
				   }
				   return res%mod;
			}
/*	static long power(long x,long y) { 
        long res=1;  
        x%=m;  
        while(y>0) { 
            if(y%2!=0) 
                res=(res*x)%m; 
            y=y>>1;
            x=(x*x)%m; 
        } 
        return res; 
    } 			
*/
	    
static long gcd(long a, long b)
{
if(b==0)
return a;
else
return gcd(b, a%b);
}
static long  nextPower_2 (  long x, long y )
{

long  count  =  0 ;
while ( y < x )
{count ++ ;
y  =  y <<  1 ;
}
return  count ;
}
/*
static long power(long a, long b, long p) 
{ 	long x = 1, y = a;
while (b > 0) {
if (b % 2 == 1) {
x = (x * y);
if (x >= p) x %= p;
}
y = (y * y); if (y >= p) y %= p;
b /= 2;}
return x;
}*/
public static class Modular {

private int MOD;

Modular(int MOD) {
   this.MOD = MOD;
}

public long add(long a, long b) {
   return (a + b) % MOD;
}

public long sub(long a, long b) {
   return (a - b + MOD) % MOD;
}

public long mul(long a, long b) {
   return (a * b) % MOD;
}

public long div(long a, long b) {
   return mul(a, inverseEuler(b));
}	public long power(long a, long b) {
long x = 1, y = a;
while (b > 0) {
    if (b % 2 == 1) {
        x = (x * y);if (x >= MOD) x %= MOD;
    }
    y = (y * y);
    if (y >= MOD) y %= MOD;
    b /= 2;}
return x;
}

public long inverseEuler(long n) {
return power(n, MOD - 2);
}
}
	static class FastReader {
byte[] buf = new byte[2048];
int index, total;
InputStream in;FastReader(InputStream is) {
in = is;
}	int scan() throws IOException {
if (index >= total) {
index = 0;
total = in.read(buf);
if (total <= 0) { return -1;
}
}
return buf[index++];
}

String next() throws IOException {
int c;
for (c = scan(); c <= 32; c = scan()) ;
StringBuilder sb = new StringBuilder(); for (; c > 32; c = scan()) {
 sb.append((char) c);}
return sb.toString();
}String nextLine() throws IOException {
int c;for (c = scan(); c <= 32; c = scan()) ;
StringBuilder sb = new StringBuilder();
for (; c != 10 && c != 13; c = scan()) {
    sb.append((char) c);
} return sb.toString();
}char nextChar() throws IOException {
int c;
for (c = scan(); c <= 32; c = scan()) ;
return (char) c;
}	int nextInt() throws IOException {
int c, val = 0;
for (c = scan(); c <= 32; c = scan()) ;
boolean neg = c == '-';
if (c == '-' || c == '+') {
    c = scan(); }
for (; c >= '0' && c <= '9'; c = scan()) {
    val = (val << 3) + (val << 1) + (c & 15);
}
return neg ? -val : val;
}long nextLong() throws IOException {
int c;long val = 0;
for (c = scan(); c <= 32; c = scan()) ;
boolean neg = c == '-';
if (c == '-' || c == '+') {
    c = scan();
}
for (; c >= '0' && c <= '9'; c = scan()) {
    val = (val << 3) + (val << 1) + (c & 15);
}
return neg ? -val : val;
}
}

static class FastScanner{
	BufferedReader br;
	StringTokenizer st;
	public FastScanner(){br=new BufferedReader(new InputStreamReader(System.in));}
	String nextToken(){
		while(st==null||!st.hasMoreElements())
			try{st=new StringTokenizer(br.readLine());}catch(Exception e){}
		return st.nextToken();
	}
	int nextInt(){return Integer.parseInt(nextToken());}
	long nextLong(){return Long.parseLong(nextToken());}
	double nextDouble(){return Double.parseDouble(nextToken());}
}
}


import java.util.LinkedList;
import java.util.List;

public class Pascal 
{
    /**
     * @param numRows
     * @return a list containing the rows of pascal's triangle
     * @throws Exception
     */
    public static List<List<Integer>> GenerateTriangle(int rows) throws Exception 
    {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        
        for (int line=0; line<rows; line++)
        {
            List<Integer> newList = new LinkedList<>();
            for (int i = 0; i <= line; i++)
            {
                newList.add(BinomialCoeff(line,i));
            }
            result.add(newList);
        }
        return result;
    }
    
    /**
     * @param n
     * @param k
     * @return the binomial coefficient of the k-th term in an n-power binomial
     * @throws Exception
     */
    private static int BinomialCoeff(int n, int k) throws Exception
    {
        if (k <= 0) return 1;
         
        if (k > n - k)
            k = n - k;
        return Factorial(n) / (Factorial(n-k) * Factorial(k));
    }

    private static int Factorial(int fact) throws Exception
    {
        if (fact < 0) throw new Exception();
        if (fact <= 1) return 1;
        return fact * Factorial(fact-1);
    }
}

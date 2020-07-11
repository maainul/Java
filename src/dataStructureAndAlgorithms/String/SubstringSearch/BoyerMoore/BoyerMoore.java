package dataStructureAndAlgorithms.String.SubstringSearch.BoyerMoore;

public class BoyerMoore
{
    public static void main(String[] args)
    {
        System.out.println(search("Is the pattern a substring?", "substr"));
    }

    //----------------------------------------------------------------
    // Returns index in text where match with pattern begins.
    // Returns -1 if no match exists.
    //----------------------------------------------------------------
    public static int search(String T, String P)
    {
        int i = P.length() -1;
        int j = P.length() -1;
        do
        {
            if (P.charAt(j) == T.charAt(i))
            {
                if (j == 0)
                {
                    return i; // a match!
                }
                else
                {
                    i--;
                    j--;
                }
            }
            else
            {
                i = i + P.length() - min(j, 1+last(T.charAt(i), P));    
                j = P.length()-1;
            }
        } while(i <= T.length()-1);

        return -1;
    }

    //----------------------------------------------------------------
    // Returns index of last occurrence of character in pattern.
    //----------------------------------------------------------------
    public static int last(char c, String P)
    {
        for (int i=P.length()-1; i>=0; i--)
        {
            if (P.charAt(i) == c)
            {
                return i;
            }
        }
        return -1;
    }


    //----------------------------------------------------------------
    // Returns the minimum of two integers.
    //----------------------------------------------------------------
    public static int min(int a, int b)
    {
        if (a < b)
            return a;
        else if (b < a)
            return b;
        else 
            return a;
    }
}
class Generate_paranthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        backtrack(n,0,0,new StringBuilder(),ans);
        return ans;
    }
    private void backtrack(int n,int open,int close,StringBuilder curr,List<String> ans){
        if(open==n&&close==n){
            ans.add(curr.toString());
            return;
        }
        if(open<n){
            curr.append('(');
            backtrack(n,open+1,close,curr,ans);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<open){
            curr.append(')');
            backtrack(n,open,close+1,curr,ans);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}

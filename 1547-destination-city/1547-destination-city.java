class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<paths.size();i++){
            List<String> p=paths.get(i);
            String from=p.get(0);
            set.add(from);
        }
        for(int i=0;i<paths.size();i++){
            List<String> p=paths.get(i);
            String to=p.get(1);
            if(!set.contains(to)){
                return to;
            }
        }
        return "";
    }
}
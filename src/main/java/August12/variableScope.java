package August12;

class variableScope {
    private String device;
    public void setDevice(String device){
        this.device = device;
    }
    public String getDevice(){return device;}
}


class trackStar{
    public static void main(String[] args) {
        variableScope scope = new variableScope();
//        System.out.println(scope.device());
        // ^^ This won't work because the variable is private
        // I'll use the public getter & setter methods
        scope.setDevice("laptop");
        System.out.println(scope.getDevice());
    }
}

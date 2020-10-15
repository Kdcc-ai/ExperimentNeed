package opensource;
public class jmeter {
       private String name;
       private String friend;
       public jmeter(String name,String friend) {
    	   this.name=name;
    	   this.friend=friend;
       }
       public String getName(){
    	   return this.name;
       }
       public String getFriend() {
    	   return this.friend;
       }
       public void setName(String name) {
    	   this.name=name;
       }
       public void setFriend(String friend) {
    	   this.friend=friend;
       }
       
}

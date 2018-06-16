import java.io.*;
class CreateFile{
public static void main(String[] args) throws IOException{
  File f=new File("F:\\Niharika\\files\\Acadview\\abc.txt");
if(!f.exists()){
  f.createNewFile();}
System.out.print("CONTENTS OF FILE:");
FileReader fr=new FileReader(f);
int ch=fr.read();
while(ch!=-1){
System.out.print((char)ch);
ch=fr.read();
}
 System.out.println("\nPath: "+f.getPath());
}
}
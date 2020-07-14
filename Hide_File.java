import java.io.*;
class Hide_File
{
    public static void Encrypt()throws IOException
    {
        
        FileInputStream fin=new FileInputStream("D:\\sahil.mp4");
        DataInputStream din=new DataInputStream(fin);
        FileOutputStream fout=new FileOutputStream("D:\\temp.mp4");
        DataOutputStream dout=new DataOutputStream(fout);
        boolean eof=false;
        while(eof==false)
        {
            try
            {
                byte b=din.readByte();
                b+=2;
                dout.writeByte(b);
            }
            catch(EOFException e)
            {
                eof=true;
            }
        }
        dout.close();
        fout.close();
        din.close();
        fin.close();
        File f1=new File("D:\\sahil.mp4");
        File f2=new File("D:\\temp.mp4");
        f1.delete();
        f2.renameTo(f1);
    }
    public static void Decrypt()throws IOException
    {
        
        FileInputStream fin=new FileInputStream("D:\\sahil.mp4");
        DataInputStream din=new DataInputStream(fin);
        FileOutputStream fout=new FileOutputStream("D:\\temp.mp4");
        DataOutputStream dout=new DataOutputStream(fout);
        boolean eof=false;
        while(eof==false)
        {
            try
            {
                byte b=din.readByte();
                b-=2;
                dout.writeByte(b);
            }
            catch(EOFException e)
            {
                eof=true;
            }
        }
        dout.close();
        fout.close();
        din.close();
        fin.close();
        File f1=new File("D:\\sahil.mp4");
        File f2=new File("D:\\temp.mp4");
        f1.delete();
        f2.renameTo(f1);
    }
}

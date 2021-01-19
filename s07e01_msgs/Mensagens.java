import java.util.*;

class Msg{
    int id;
    String sender;
    String text;
    public Msg(int id, String sender, String text){
        this.id = id;
        this.sender = sender;
        this.text = text;
    }
    public String toString(){
        return "" + id + ":" + sender + ":" + text;
    }
}

class Usuario{
    String username;
    ArrayList<Msg> inbox;
    int unreadCount;
    int nextId;

    public Usuario(String username){
        this.username = username;
        this.inbox = new ArrayList<>();
        this.unreadCount = 0;
        this.nextId = 0;
    }

    void sendMsg(Usuario receiver, String text){
        receiver.inbox.add(new Msg(this.nextId, this.username, text));
        this.nextId += 1;
        receiver.unreadCount += 1;
    }

    ArrayList<Msg> getMsgs(){
        ArrayList<Msg> output = new ArrayList<>();
        for(int i = inbox.size() - this.unreadCount; i < inbox.size(); i++)
            output.add(inbox.get(i));
        this.unreadCount = 0;
        return output;
    }
}

class Sistema{
    ArrayList<Usuario> usuarios;
    public Sistema(){
        this.usuarios = new ArrayList<>();
    }
    Usuario getUser(String username){
        for(Usuario usuario : this.usuarios)
            if(usuario.username.equals(username))
                return usuario;
        return null;
    }
    void addUser(String username){
        if(this.getUser(username) == null){
            this.usuarios.add(new Usuario(username));
            return;
        }
        System.out.println("Ja existe um usuario com esse nome");
    }
    void sendMsg(String sender, String receiver, String text){
        Usuario one = this.getUser(sender);
        if(one == null){
            System.out.println("Username nao existe " + sender);
            return;
        }
        Usuario two = this.getUser(receiver);
        if(two == null){
            System.out.println("Username nao existe " + receiver);
            return;
        }
        one.sendMsg(two, text);
    }
    void readMsgs(String username){
        Usuario usuario = this.getUser(username);
        if(usuario == null){
            System.out.println("Esse username nao existe");
            return;
        }
        String saida = "";
        for(Msg msg : usuario.getMsgs())
            saida += msg + "\n";
        System.out.print(saida);
    }
}

public class Mensagens{
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.addUser("mirella");
        sistema.addUser("larah");
        sistema.addUser("aurivanio");

        sistema.sendMsg("mirella", "larah", "aurivanio otario na esquina");
        sistema.sendMsg("mirella", "larah", "partiu interceptar?");
        // sistema.readMsgs("larah");
        sistema.sendMsg("larah", "mirella", "pega o fuzil que esse eu quero morto!");
        // sistema.readMsgs("mirella");
        sistema.sendMsg("mirella", "aurivanio", "passa o ticket do Ru");
        sistema.readMsgs("aurivanio");
        sistema.sendMsg("mirella", "aurivanio", "tra la la la la");
        sistema.readMsgs("aurivanio");

        // Usuario aurivanio = new Usuario("aurivanio");
        // Usuario mirella = new Usuario("mirella");

        // aurivanio.sendMsg(mirella, "amiga, porra, vamos comer!!!");
        // aurivanio.sendMsg(mirella, "se demorar a responder, eu levo a Adriana");
        // aurivanio.sendMsg(mirella, "rodizio de gratis no Veneza");

        // ArrayList<Msg> msgs = mirella.getMsgs();
        // for(Msg msg : msgs)
        //     System.out.println(msg);

        // aurivanio.sendMsg(mirella, "pedro chegou aqui e disse que voce mandou ele??!!");

        // msgs = mirella.getMsgs();
        // for(Msg msg : msgs)
        //     System.out.println(msg);
    }
}


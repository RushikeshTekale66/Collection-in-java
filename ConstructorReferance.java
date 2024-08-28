interface MessageDisplay{
	Message getMessage(String msg);
}

class Message{
	Message(String msg){
		System.out.println(msg);
	}
}

class ConstructorReferance{
	public static void main(String [] args){
		MessageDisplay ms = Message::new;
		ms.getMessage("Hi I am rushikesh Tekale");
	}
}
/**
   A message left by the caller.
*/
public class Message
{
   /**
      Construct a Message object.
   */
   public Message(String messageText)
   {
      text = messageText;
   }

   /**
      Get the message text.
   */
   public String getText()
   {
      return text;
   }

   private String text;
}

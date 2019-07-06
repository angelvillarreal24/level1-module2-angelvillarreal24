package _07_tea_party;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaPartyTest {
       /**
        * Jane Austen is a woman, so say “Hello Ms. Austen”. 
        * George Orwell is a man, so say “Hello Mr. Orwell”. 
        * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
        **/

       @Test
       public void test() {
               TeaParty teaParty = new TeaParty();
               String greeting = teaParty.welcome(null, false, false);
               assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
               assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
               assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
       }
}

//
//class Hell {
//		int hotness;
//    void Hell(int hotness) {
//	this.hotness = hotness
//
//
//    }
//
//}
//
//public class Bacon {
//
//    String style = "streaky";
//
//    void Bacon (String style) {
//          this.style = style;
//    }
//
//}
//
//public class Unicorn {
//
//		int horns;
//    private void Unicorn() {
//          this.horns = 1;
//    }
//
//}
//
//class Narwhal {
//
//    public void Narwhal(){}
//	syso"lol";
//}


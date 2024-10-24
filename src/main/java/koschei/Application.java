package koschei;

import koschei.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        KoscheiTheDeathless koscheiTheDeathless =
                applicationContext.getBean(KoscheiTheDeathless.class);
        System.out.println(koscheiTheDeathless.getRulesByDeth());
    }
}


/*На свете есть океан ,     KoscheiTheDeathless
на океане остров ,          Ocean1
на острове дерево ,         Island2
на дереве заяц ,            Wood3
в зайце утка ,              Rabbit4
в утке яйцо ,               Duck5
в яйце иголка ,             Egg6
смерть Кощея на игле :(     Needle7
*/
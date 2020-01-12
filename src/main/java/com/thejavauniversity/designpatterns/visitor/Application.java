package com.thejavauniversity.designpatterns.visitor;

public class Application implements System {

    System[] systems;

    Application() {
        systems = new System[]{new System1(), new System2()};
    }

    @Override
    public void accept(Visitor vistor) {
        for (int i = 0; i < systems.length; i++) {
            systems[i].accept(vistor);
        }
    }
}

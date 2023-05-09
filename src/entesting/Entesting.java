package entesting;

import entesting.gen.entities.*;

import mindustry.mod.*;

@SuppressWarnings("unused")
public class Entesting extends Mod{
    @Override
    public void loadContent(){
        EntityRegistry.register();
    }
}

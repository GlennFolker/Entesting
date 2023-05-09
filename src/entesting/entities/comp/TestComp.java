package entesting.entities.comp;

import arc.*;
import ent.anno.Annotations.*;
import mindustry.gen.*;

@EntityComponent
@EntityDef({Unitc.class, Healthc.class})
abstract class TestComp implements Unitc, Healthc{
    @Override
    public void killed(){
        Core.app.exit();
    }
}

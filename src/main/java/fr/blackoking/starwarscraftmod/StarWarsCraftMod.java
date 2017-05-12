package fr.blackoking.starwarscraftmod;

import fr.blackoking.starwarscraftmod.proxy.CommonProxy;
import fr.blackoking.starwarscraftmod.utils.References;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Thomas on 12/05/2017.
 */
@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class StarWarsCraftMod {

    @SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.Instance(References.MODID)
    public static StarWarsCraftMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preinit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init();
    }

}

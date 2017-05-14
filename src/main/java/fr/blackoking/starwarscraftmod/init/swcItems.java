package fr.blackoking.starwarscraftmod.init;

import fr.blackoking.starwarscraftmod.StarWarsCraftMod;
import fr.blackoking.starwarscraftmod.utils.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Thomas on 12/05/2017.
 */
public class swcItems {

    public swcItems() {
        initItems();
        registerItems();
        registerRenders();
    }

    public static Item CristalKyber;
    public static Item SabreLaser;

    public void initItems() {
        CristalKyber = new Item().setRegistryName("cristalkyber").setUnlocalizedName("cristalkyber").setCreativeTab(StarWarsCraftMod.swcTab);
        SabreLaser = new Item().setRegistryName("sabrelaser").setUnlocalizedName("sabrelaser").setCreativeTab(StarWarsCraftMod.swcTab);
    }

    public void registerItems() {
        registerItem(CristalKyber);
        registerItem(SabreLaser);
    }

    @SideOnly(Side.CLIENT)
    public void registerRenders () {
    registerRender(CristalKyber, 0);
    registerRender(SabreLaser, 0);
    }

    private void registerItem(Item item) {
        GameRegistry.register(item);
    }

    private void registerRender(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }
}

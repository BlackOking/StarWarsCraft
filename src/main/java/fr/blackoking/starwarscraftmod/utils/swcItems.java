package fr.blackoking.starwarscraftmod.utils;

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

    public void initItems() {
        CristalKyber = new Item().setRegistryName("cristal_kyber").setUnlocalizedName("cristalkyber");
    }

    public void registerItems() {
        registerItem(CristalKyber);
    }

    @SideOnly(Side.CLIENT)
    public void registerRenders () {
    registerRender(CristalKyber, 0);
    }

    private void registerItem(Item item) {
        GameRegistry.register(item);
    }

    private void registerRender(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }
}

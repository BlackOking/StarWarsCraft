package fr.blackoking.starwarscraftmod.init;

import fr.blackoking.starwarscraftmod.utils.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Thomas on 13/05/2017.
 */
public class swcBlocks {

    public swcBlocks() {
        init();
        registers();
        registerItemBlocks();
        registerRenders();
    }

    public static Block MineraiKyberBleu;

    private void init(){
        MineraiKyberBleu = new Block(Material.ROCK).setHardness(2.0f).setResistance(1.5f).setRegistryName("mineraikyberbleu").setUnlocalizedName("mineraikyberbleu");
    }

    private void registers() {
        register(MineraiKyberBleu);
    }

    @SideOnly(Side.CLIENT)
    private void registerRenders() {
        registerRender(MineraiKyberBleu, 0);
    }

    private void registerItemBlocks() {
        registerItemBlock(MineraiKyberBleu);
    }

    /* */

    private void register(Block block) {
        GameRegistry.register(block);
    }

    private void registerRender(Block block, int meta) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(References.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
    }

    private void registerItemBlock(Block block) {
        ItemBlock ib = new ItemBlock(block);
        ib.setRegistryName(block.getRegistryName());
        GameRegistry.register(ib);
    }
}

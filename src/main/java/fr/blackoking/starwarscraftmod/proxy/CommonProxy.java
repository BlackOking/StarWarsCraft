package fr.blackoking.starwarscraftmod.proxy;

import fr.blackoking.starwarscraftmod.init.swcBlocks;
import fr.blackoking.starwarscraftmod.init.swcItems;

/**
 * Created by Thomas on 12/05/2017.
 */
public class CommonProxy {

    public void preinit() {

        new swcItems();
        new swcBlocks();
    }

        public void init() {

        }
}

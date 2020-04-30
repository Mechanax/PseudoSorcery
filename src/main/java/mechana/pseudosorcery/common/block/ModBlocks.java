package mechana.pseudosorcery.common.block;

import mechana.pseudosorcery.common.lib.LibMisc;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = LibMisc.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(LibMisc.MOD_ID)
public class ModBlocks {
    @ObjectHolder("raked_sand") public static Block RAKEDSAND;
    //@ObjectHolder("rake_sand_corner") public static Block RAKEDSANDCORNER;
}

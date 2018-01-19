package mod.harvestcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class HcPlant extends Block implements IPlantable
{

    public HcPlant(int par1, Material par2Material) {
        super(par1, par2Material);
        // TODO Auto-generated constructor stub
    }

    @Override
    public EnumPlantType getPlantType(World world, int x, int y, int z)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getPlantID(World world, int x, int y, int z)
    {
        // TODO Auto-generated method stub
        return blockID;
    }

    @Override
    public int getPlantMetadata(World world, int x, int y, int z)
    {
        // TODO Auto-generated method stub
        return world.getBlockMetadata(x, y, z);
    }

}

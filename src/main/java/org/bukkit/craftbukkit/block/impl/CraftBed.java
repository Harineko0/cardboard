/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.block.impl;

public final class CraftBed extends org.bukkit.craftbukkit.block.data.CraftBlockData implements org.bukkit.block.data.type.Bed, org.bukkit.block.data.Directional {

    public CraftBed() {
        super();
    }

    public CraftBed(net.minecraft.block.BlockState state) {
        super(state);
    }

    // org.bukkit.craftbukkit.v1_19_R3.block.data.type.CraftBed

    private static final net.minecraft.state.property.EnumProperty<?> PART = getEnum(net.minecraft.block.BedBlock.class, "part");
    private static final net.minecraft.state.property.BooleanProperty OCCUPIED = getBoolean(net.minecraft.block.BedBlock.class, "occupied");

    @Override
    public org.bukkit.block.data.type.Bed.Part getPart() {
        return get(PART, org.bukkit.block.data.type.Bed.Part.class);
    }

    @Override
    public void setPart(org.bukkit.block.data.type.Bed.Part part) {
        set(PART, part);
    }

    @Override
    public boolean isOccupied() {
        return get(OCCUPIED);
    }

    // org.bukkit.craftbukkit.v1_19_R3.block.data.CraftDirectional

    private static final net.minecraft.state.property.EnumProperty<?> FACING = getEnum(net.minecraft.block.BedBlock.class, "facing");

    @Override
    public org.bukkit.block.BlockFace getFacing() {
        return get(FACING, org.bukkit.block.BlockFace.class);
    }

    @Override
    public void setFacing(org.bukkit.block.BlockFace facing) {
        set(FACING, facing);
    }

    @Override
    public java.util.Set<org.bukkit.block.BlockFace> getFaces() {
        return getValues(FACING, org.bukkit.block.BlockFace.class);
    }

	@Override
	public void setOccupied(boolean arg0) {
		set(OCCUPIED, arg0);
	}
}

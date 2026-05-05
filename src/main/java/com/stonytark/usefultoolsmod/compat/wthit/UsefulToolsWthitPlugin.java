package com.stonytark.usefultoolsmod.compat.wthit;

import com.stonytark.usefultoolsmod.block.custom.SpectralInfuserBlock;
import com.stonytark.usefultoolsmod.block.entity.SpectralInfuserBlockEntity;
import com.stonytark.usefultoolsmod.entity.custom.GhostEntity;
import mcp.mobius.waila.api.IRegistrar;
import mcp.mobius.waila.api.IWailaPlugin;
import mcp.mobius.waila.api.TooltipPosition;

public class UsefulToolsWthitPlugin implements IWailaPlugin {

    @Override
    public void register(IRegistrar registrar) {
        // Register block data providers for block entities
        registrar.addBlockData(new SpectralInfuserDataProvider(), SpectralInfuserBlock.class);

        // Register block component provider
        registrar.addComponent(new SpectralInfuserComponentProvider(), TooltipPosition.BODY,
                SpectralInfuserBlock.class);

        // Register entity component provider
        registrar.addComponent(new GhostComponentProvider(), TooltipPosition.BODY, GhostEntity.class);
    }
}

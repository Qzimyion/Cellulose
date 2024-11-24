package net.qzimyion.cellulose.villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;

public class CelluloseVillagerTrades {

    public static void registerTrades(){
        //Level: 1
        TradeOfferHelper.registerVillagerOffers(CelluloseVillagers.CARPENTER, 1, factories -> factories.add((((entity, random) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 2),
                new ItemStack(Items.OAK_LOG, 8),
                10, 2, 0.02f
        ))))
        );
        TradeOfferHelper.registerVillagerOffers(CelluloseVillagers.CARPENTER, 1, factories -> factories.add((((entity, random) -> new MerchantOffer(
                new ItemStack(Items.OAK_LOG, 16),
                new ItemStack(CelluloseBlocks.AZALEA_LOG, 16),
                10, 5, 0.04f
        ))))
        );
        //Level: 2
        TradeOfferHelper.registerVillagerOffers(CelluloseVillagers.CARPENTER, 2, factories -> factories.add((((entity, random) -> new MerchantOffer(
                new ItemStack(Items.BAMBOO_MOSAIC, 32),
                new ItemStack(CelluloseBlocks.OMEGA_BAMBOO, 4),
                10, 2, 0.02f
                ))))
        );
    }
}

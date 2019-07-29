package com.ericlam.mc.minigames.core.event.section;

import com.ericlam.mc.minigames.core.game.GameState;
import com.ericlam.mc.minigames.core.game.InGameState;
import com.ericlam.mc.minigames.core.manager.PlayerManager;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class GameVotingEvent extends GameSectionEvent {
    public GameVotingEvent(@Nonnull PlayerManager playerManager, @Nullable InGameState inGameState, GameState gameState) {
        super(playerManager, inGameState, gameState);
    }
}

package homework_2.market;

import java.util.List;

import homework_2.actor.Actor;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}

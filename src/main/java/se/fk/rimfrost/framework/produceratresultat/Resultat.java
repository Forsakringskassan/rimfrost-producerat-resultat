package se.fk.rimfrost.framework.produceratresultat;

import org.immutables.value.Value;

@Value.Immutable
public interface Resultat
{
   String typ();

   int version();

   String data();
}

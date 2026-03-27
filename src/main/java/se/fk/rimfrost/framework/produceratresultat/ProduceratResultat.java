package se.fk.rimfrost.framework.produceratresultat;

import org.immutables.value.Value;
import java.time.OffsetDateTime;
import java.util.UUID;

@Value.Immutable
public interface ProduceratResultat
{
   UUID id();

   int version();

   OffsetDateTime from();

   OffsetDateTime tom();

   String yrkandeStatus();

   String avslagsanledning();

   String typ();

   Resultat resultat();
}

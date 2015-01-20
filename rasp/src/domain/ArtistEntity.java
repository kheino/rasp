package domain;

public class ArtistEntity extends PersistedEntity<Integer> implements HasName {
   private String name;

   @Override
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
      setChanged(true);
   }
}
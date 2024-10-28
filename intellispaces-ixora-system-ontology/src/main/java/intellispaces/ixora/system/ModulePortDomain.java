package intellispaces.ixora.system;

import intellispaces.jaquarius.annotation.Channel;
import intellispaces.jaquarius.annotation.Domain;

/**
 * Module port.
 */
@Domain("9c48d431-b4fb-4613-92ad-84478331a57f")
public interface ModulePortDomain {

  @Channel("ead777d3-38b0-46c3-9da1-a9ea3cb3b9f7")
  ModuleDomain module();
}

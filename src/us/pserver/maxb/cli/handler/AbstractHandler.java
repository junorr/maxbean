/*
 * Direitos Autorais Reservados (c) 2011 Juno Roesler
 * Contato: juno.rr@gmail.com
 * 
 * Esta biblioteca é software livre; você pode redistribuí-la e/ou modificá-la sob os
 * termos da Licença Pública Geral Menor do GNU conforme publicada pela Free
 * Software Foundation; tanto a versão 2.1 da Licença, ou qualquer
 * versão posterior.
 * 
 * Esta biblioteca é distribuída na expectativa de que seja útil, porém, SEM
 * NENHUMA GARANTIA; nem mesmo a garantia implícita de COMERCIABILIDADE
 * OU ADEQUAÇÃO A UMA FINALIDADE ESPECÍFICA. Consulte a Licença Pública
 * Geral Menor do GNU para mais detalhes.
 * 
 * Você deve ter recebido uma cópia da Licença Pública Geral Menor do GNU junto
 * com esta biblioteca; se não, acesse 
 * http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html, 
 * ou escreva para a Free Software Foundation, Inc., no
 * endereço 59 Temple Street, Suite 330, Boston, MA 02111-1307 USA.
 */

package us.pserver.maxb.cli.handler;

import us.pserver.maxb.cli.MBOptions;
import us.pserver.maxb.sql.spec.ISchema;

/**
 *
 * @author Juno Roesler - juno@pserver.us
 * @version 0.0 - 21/02/2016
 */
public abstract class AbstractHandler implements Handler {

  protected final MBOptions opt;
  
  protected final ISchema schema;
  
  
  protected AbstractHandler(MBOptions opt, ISchema sch) {
    if(opt == null) {
      throw new IllegalArgumentException(
          "MBOptions must be not null"
      );
    }
    if(sch == null) {
      throw new IllegalArgumentException(
          "Schema must be not null"
      );
    }
    this.opt = opt;
    this.schema = sch;
  }
  
  
  @Override
  public ISchema getSchema() {
    return schema;
  }


  @Override
  public MBOptions getOptions() {
    return opt;
  }

}
